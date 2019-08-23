package th.ku.emailtemplate;

public class Template {
    private String variableData;
    private String templateText;

    public Template(String s) {
        this.templateText = s;
    }

    public void set(String val, String data) {
        this.variableData = data;
    }

    public String evaluate() {
        return this.templateText.replaceAll("\\$\\{name\\}", this.variableData);
    }
}
