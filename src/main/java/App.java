import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Word> words = request.session().attribute("words");
      if (words == null) {
        words = new ArrayList<Word>();
        request.session().attribute("words", words);
      }
      String _word = request.queryParams("inputWord");
      String _definition = request.queryParams("inputDefinition");

      Word newWord = new Word(_word);
      words.add(newWord);

      Definition newDefinition = new Definition(_definition);
      newWord.addDefinition(newDefinition);

      model.put("words", words);
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
