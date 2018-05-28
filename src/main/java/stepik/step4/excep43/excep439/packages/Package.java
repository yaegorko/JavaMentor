package stepik.step4.excep43.excep439.packages;

import java.util.Objects;

/*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/
public class Package {
    private final String content;
    private final int price;

    public Package(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Package aPackage = (Package) o;

        if (price != aPackage.price) {
            return false;
        }
        return content.equals(aPackage.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(content, price);
    }
}