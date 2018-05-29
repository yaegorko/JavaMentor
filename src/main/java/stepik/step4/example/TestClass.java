package stepik.step4.example;

public class TestClass {

    public static void main(String[] args) throws Exception {

        try(Resource resource = new Resource("ресурс 1"); Resource resource2 = new Resource("ресурс 2")) {
            System.err.println("Это трай");
            resource.start();

        }  finally {

            System.err.println("А это файнали");

        }

    }
}
