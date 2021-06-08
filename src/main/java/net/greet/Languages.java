package net.greet;

public enum Languages {

    XHOSA("MOLO "),
    ENGLISH("HELLO "),
    ZULU("SAWUBONA ");

    String lang;

    Languages(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang.substring(0, 1).toUpperCase() + lang.substring(1).toLowerCase();
    }
}
