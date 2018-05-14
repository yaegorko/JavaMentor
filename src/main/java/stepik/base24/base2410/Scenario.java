package stepik.base24.base2410;

public class Scenario {

    public String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            result.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    String positionNumber = (i + 1) + ")";
                    String formatedText = textLines[i].substring(role.length() + 1);
                    result.append(positionNumber).append(formatedText).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
