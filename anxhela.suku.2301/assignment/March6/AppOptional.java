package assignment.March6;

import java.util.Optional;

public class AppOptional {
    
    // Create an example based on the Cupboard/Safe/Box/Jewelly example but with objects from a different domain.
    public static void main(String[] args) {
        // 1. Without optionals
        // 1.a  Window is not empty
        Window window1 = new Window("Save");
        Application app1 = new Application(window1);
        Computer comp1 = new Computer(app1);
        String button1 = comp1.geApplication().getWindow().getButton();
        System.out.println("Button name " + button1);

        // 1.b Window is empty
        Window windowEmpty = new Window();
        Application appEmpty = new Application();
        Computer compEmpty = new Computer();
        try {
            String buttonEmpty = compEmpty.geApplication().getWindow().getButton();
            System.out.println(buttonEmpty);
        } catch (NullPointerException e) {
            System.out.println("NULL VALUE");
        }

        // 2. With optionals

        // 2.a Window is not empty
        Optional<String> windowOptional1 = comp1.getApplicationOptional()
        .flatMap(Application::getOptionalWindow)
        .flatMap(Window::getButtonOptional);
        windowOptional1.ifPresent((String str) -> System.out.println(str));

        // 2.b Box is empty
        Optional<String> buttonEmptyOptional = compEmpty.getApplicationOptional()
        .flatMap(Application::getOptionalWindow)
        .flatMap(Window::getButtonOptional);

        buttonEmptyOptional.ifPresentOrElse((String str) -> {
            System.out.println(str);
        }, () -> {
            System.out.println("No Click Button");
        });
        
    }
}

class Computer{

    Application application;

    Computer (){
    }

    Computer(Application application){
        this.application = application;
    }

    Application geApplication(){
        return application;
    }

    Optional <Application> getApplicationOptional(){
        return Optional.ofNullable(application);
    }
}

class Application {

    Window window;

    Application(){}

    Application(Window window){
        this.window = window;
    }

    Window getWindow(){
        return window;
    }

    Optional<Window> getOptionalWindow(){
        return Optional.ofNullable(window);
    }

}

class Window {

    String button;

    Window(){}

    Window(String button){
        this.button = button;
    }

    String getButton(){
        return button;
    }

    Optional<String> getButtonOptional(){
        return Optional.ofNullable(button);
    }

}