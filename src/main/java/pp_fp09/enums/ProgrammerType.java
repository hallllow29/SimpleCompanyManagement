package pp_fp09.enums;

public enum ProgrammerType {

    JUNIOR,
    SENIOR;

    public static String typeToString(ProgrammerType type) {
        switch (type) {
            case JUNIOR:
                return "Junior";
            default:
                return "Senior";
        }
    }
}
