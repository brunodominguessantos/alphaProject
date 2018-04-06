package org.academiadecodigo.alpha.services;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    private static ServiceRegistry registry;
    private Map<String, Service> registryMap = new HashMap<>();

    private ServiceRegistry() {
    }

    public static ServiceRegistry getServiceRegistry() {

        if (registry == null) {
            registry = new ServiceRegistry();
        }

        return registry;

    }


    public Service getService(String sname) {
        return registryMap.get(sname);
    }


    public void registerService(String sname, Service service) {
        registryMap.put(sname, service);
    }


    public void unregisterService(String sname) {
        registryMap.remove(sname);
    }

    public void setRegistryMap(Map<String, Service> registryMap) {
        this.registryMap = registryMap;
    }
}
