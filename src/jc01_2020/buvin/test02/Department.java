package jc01_2020.buvin.test02;

public enum  Department {

    A1("Кухня"),
    A2("Рентген кабинет"),
    A3("МАЗ");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Department getDepartment(Employee employee) {

        return null;
    }
    public static String getStringDepartment(Employee employee) {
        if (employee.getDepartment()==A1){return "Кухня";}
        else
        if (employee.getDepartment()==A2){return "Рентген кабинет";}
        else if (employee.getDepartment()==A3){return "МАЗ";}

        return null;
    }


}
