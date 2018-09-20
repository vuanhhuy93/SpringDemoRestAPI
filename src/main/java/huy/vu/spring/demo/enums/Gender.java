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
            if (gender.getValue().equals(code)){
                return gender;
            }
        }
        return null;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
