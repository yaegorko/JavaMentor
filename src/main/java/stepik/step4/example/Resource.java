package stepik.step4.example;

public class Resource implements AutoCloseable {
    private String name;

    public Resource(String name) {
        this.name = name;
        System.err.println("Создан " + this.name);
    }


    public void start() {
        throw new RuntimeException("Это эксепшн из старт");
    }


    @Override
    public void close() throws Exception {
        System.err.println("Это клоз " + name);
        throw new RuntimeException("Это эксепшн из close " + name);
    }
}


