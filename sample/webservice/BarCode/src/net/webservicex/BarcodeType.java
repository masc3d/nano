// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package net.webservicex;

public enum BarcodeType {

    CODE_2_5_INTERLEAVED("Code_2_5_interleaved"),


    CODE_2_5_INDUSTRIAL("Code_2_5_industrial"),


    CODE_2_5_MATRIX("Code_2_5_matrix"),


    CODE_39("Code39"),


    CODE_39_EXTENDED("Code39Extended"),


    CODE_128_A("Code128A"),


    CODE_128_B("Code128B"),


    CODE_128_C("Code128C"),


    CODE_93("Code93"),


    CODE_93_EXTENDED("Code93Extended"),


    CODE_MSI("CodeMSI"),


    CODE_POST_NET("CodePostNet"),


    CODE_CODABAR("CodeCodabar"),


    CODE_EAN_8("CodeEAN8"),


    CODE_EAN_13("CodeEAN13"),


    CODE_UPC_A("CodeUPC_A"),


    CODE_UPC_E_0("CodeUPC_E0"),


    CODE_UPC_E_1("CodeUPC_E1"),


    CODE_UPC_SUPP_2("CodeUPC_Supp2"),


    CODE_UPC_SUPP_5("CodeUPC_Supp5"),


    CODE_EAN_128_A("CodeEAN128A"),


    CODE_EAN_128_B("CodeEAN128B"),


    CODE_EAN_128_C("CodeEAN128C");


    private final String value;

    BarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeType fromValue(String v) {
        if (v != null) {
            for (BarcodeType c : BarcodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}