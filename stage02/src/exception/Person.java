package exception;

public class Person {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws ILLegalAgeException {
        if (age > 100 || age < 0) {
//            throw new RuntimeException("年龄不合法！");
            throw new ILLegalAgeException("年龄不合法！");
        }
        this.age = age;
    }
}
