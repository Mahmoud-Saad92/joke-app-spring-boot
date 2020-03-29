package eg.bazinga.jokeapp.controllers;

import eg.bazinga.jokeapp.services.JokeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeGeneratorService jokeGeneratorServiceImpl;

    @Autowired
    public JokesController(JokeGeneratorService jokeGeneratorServiceImpl) {
        this.jokeGeneratorServiceImpl = jokeGeneratorServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeGeneratorServiceImpl.getRandomQuote());

        return "chucknorris";
    }
}
