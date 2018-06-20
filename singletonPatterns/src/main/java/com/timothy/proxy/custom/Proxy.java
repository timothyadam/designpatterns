package com.timothy.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/6/17.
 */
public class Proxy {

    public static final String ln = "\r\n";



    public static Object newProxyInstance(TClassLoader classLoader,Class<?> [] interfaces,InvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //1、动态生成源代码.java文件
        String  src=generateSrc(interfaces);
        //2、Java文件输出磁盘
        String filePath=Proxy.class.getResource("").getPath();

        //outputStream.write(src.getBytes());
        File file=new File(filePath + "$Proxy0.java");
        FileWriter writer=new FileWriter(file);
        writer.write(src);
        writer.flush();
        writer.close();
        //3、把生成的.java文件编译成.class文件

        JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
        Iterable iterable=manage.getJavaFileObjects(file);

        JavaCompiler.CompilationTask task=compiler.getTask(null,manage,null,null,null,iterable);
        task.call();
        manage.close();
          //4、编译生成的.class文件加载到JVM中来
        Class proxyClass=classLoader.findClass("$Proxy0");
        Constructor constructor=proxyClass.getConstructor(InvocationHandler.class);
        file.delete();
        //5、返回字节码重组以后的新的代理对象


        return constructor.newInstance(h);

    }


    public  static String  generateSrc(Class<?> [] interfaces){

        StringBuffer sb = new StringBuffer();
        sb.append("package com.timothy.proxy.custom;" + ln);
        sb.append("import com.timothy.proxy.dynamic.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("InvocationHandler h;" + ln);

        sb.append("public $Proxy0(InvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();

    }




}
