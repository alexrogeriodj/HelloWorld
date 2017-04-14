public class HelloWorld {
    public static String hello(String name) {
        if (name == null || name.equals("")){
            name= ("Hello, World!");
            
        }
        else 
        {
            name= ("Hello, " + name + "!");
        }
        return name;
    }
}
