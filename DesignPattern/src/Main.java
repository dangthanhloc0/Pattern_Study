import adapter_Pattern.XmlReader;
import adapter_Pattern.iImpl.XmlToJsonAdapter;
import adapter_Pattern.interfaceEx.JsonReader;
import decorator_Pattern.iImpl.MilkDecorator;
import decorator_Pattern.iImpl.SimpleCoffee;
import decorator_Pattern.iImpl.SugarDecorator;
import decorator_Pattern.interfaceEx.Coffee;
import factory_pattern.iImpl.ShapeFactory;
import factory_pattern.interfaceEx.Shape;
import interator_pattern.iImpl.SongCollection;
import interator_pattern.interfaceEx.Iterator;
import obServer.iImpl.User;
import obServer.iImpl.YouTubeChannel;
import obServer.interfaceEx.Observer;
import strategy_Pattern.PaymentContext;
import strategy_Pattern.iImpl.CreditCardPayment;
import strategy_Pattern.iImpl.MomoPayment;
import strategy_Pattern.iImpl.PayPalPayment;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// -------------------- strategy_pattern --------------------------
//        PaymentContext context = new PaymentContext(new CreditCardPayment());
//        context.executePayment(100);
//
//        context.setPaymentStrategy(new PayPalPayment());
//        context.executePayment(200);
//
//        context.setPaymentStrategy(new MomoPayment());
//        context.executePayment(300);


// -------------------- adapter_pattern --------------------------
//        XmlReader xmlReader = new XmlReader();
//        JsonReader adapter = new XmlToJsonAdapter(xmlReader);
//        System.out.println(adapter.readJson());


// -------------------- observer_pattern --------------------------
//        YouTubeChannel channel = new YouTubeChannel();
//
//        Observer user1 = new User("Alice");
//        Observer user2 = new User("Bob");
//
//        channel.addObserver(user1);
//        channel.addObserver(user2);
//
//        channel.uploadVideo("Design Pattern Tutorial");
//        channel.removeObserver(user1);
//        channel.uploadVideo("Observer Pattern Explained");


//------------------------------decorator_pattern---------------------
//        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee.getDescription() + " = $" + coffee.getCost());
//
//        // Add Milk
//        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.getDescription() + " = $" + coffee.getCost());
//
//        // Add Sugar
//        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.getDescription() + " = $" + coffee.getCost());

//------------------------------interator_pattern---------------------
//        SongCollection playlist = new SongCollection(Arrays.asList("Song A", "Song B", "Song C"));
//        Iterator<String> iterator = playlist.createIterator();
//
//        while (iterator.hasNext()) {
//            System.out.println("Playing: " + iterator.next());
//        }


//------------------------------factory_pattern---------------------
//        ShapeFactory factory = new ShapeFactory();
//
//        Shape shape1 = factory.createShape("circle");
//        shape1.draw();
//
//        Shape shape2 = factory.createShape("rectangle");
//        shape2.draw();

    }
}
