package Task3.controller;

public interface FieldRules {
    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']*$";
    String REGEX_SURNAME_LAT = "^[A-Z][a-z]*$";
    String REGEX_LOGIN = "^[^.].+[A-Za-z][^.]$";
}
