package huy.vu.spring.demo.enums;

public enum Gender {
    MALE("MALE","Nam"),FEMALE("FEMALE","Nữ");
    private String code;
    private String value;

    private Gender( String code, String value){
        this.value = value;
        this.code = code;
    }
    public static Gender getValueByCode(String code){
        for (Gender gender : Gender.values()){
            if (gender.getCode().equals(code)){
                return gender;
            }
        }
        return null;
    }
    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
