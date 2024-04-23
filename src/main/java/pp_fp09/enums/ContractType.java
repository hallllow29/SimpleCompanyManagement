package pp_fp09.enums;

public enum ContractType {

    PARTIAL,
    INTEGRAL;

    public static String contractToString(ContractType type) {
        switch (type) {
            case PARTIAL:
                return "Partial contract";
            default:
                return "Integral contract";
        }
    }
}
