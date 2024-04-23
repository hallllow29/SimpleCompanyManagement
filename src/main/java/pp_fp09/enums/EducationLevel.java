package pp_fp09.enums;
public enum EducationLevel {

    GRADUATION,
    MASTERS_DEGREE,
    DOCTORATE;

    public static String educationToString(EducationLevel education) {
        switch (education) {
            case GRADUATION:
                return "Graduation";
            case MASTERS_DEGREE:
                return "Master's degree";
            default:
                return "Doctorate";
        }
    }
}
