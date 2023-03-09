package by.belstu.it.Gvozdovskiy.basejava;

import java.util.Objects;
/**
@author Kirill
@version 3.1
        */
public class WrapperString {
    /**@see #example */
    private String example;
    public WrapperString(String example) {
        this.example = example;
    }


    public String getExample() {
        return example;
    }

    /**@param oldChar - старый символ
     * @param newChar - новый символ*/
    public void replace(char oldChar, char newChar) {
        System.out.println("Оригинальный replace");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(example, that.example);
    }

    @Override
    public int hashCode() {
        return Objects.hash(example);
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "example='" + example + '\'' +
                '}';
    }
}
