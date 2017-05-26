package lesson5;

import lesson5.services.Service;

import java.util.ArrayList;

/**
 * Created by asv on 26.05.17.
 */
public class House {

    private ArrayList<Service> services = new ArrayList<>();

    public void addService(Service service) {

        services.add(service);
    }

    public void useAllServices() {

        services.forEach(s -> System.out.println(s.supplie()));
    }

    public void useAllServicesWithForLoop() {

        for (int i = 0; i < services.size(); i++) {

            System.out.println(services.get(i).supplie());
        }
    }
}
