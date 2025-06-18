package behavorialPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    List<Observer> observerList = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObserver();
    }
    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
     for(Observer observer: observerList) {
         observer.update(news);
     }
    }
}
