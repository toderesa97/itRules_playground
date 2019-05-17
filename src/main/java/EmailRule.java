import org.siani.itrules.TemplateEngine;

import java.util.ArrayList;
import java.util.List;

public class EmailRule {

    public static final String Template = "C:\\Users\\TDRS\\IdeaProjects\\itrulesplayground\\src\\main\\java\\rules\\email.itr";

    public static void main(String[] args) {
        String result = TemplateEngine.with(Template).render(email());
        System.out.println(result);
    }

    private static Email email() {
        return new Email("frodo@hobbiton.me", "gandalf@elrond.me", "bilbo@hobbiton.me")
                .subject("The ring")
                .addLine("I wish the Ring had never come to me.")
                .addLine("I wish none of this had happened.");
    }

    public static class Email {
        private String from;
        private String[] to;
        private String subject;
        private List<String> body = new ArrayList<String>();

        public Email(String from, String... to) {
            this.from = from;
            this.to = to;
        }

        public Email subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Email addLine(String line) {
            body.add(line);
            return this;
        }

    }

}
