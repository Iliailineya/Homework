//package org.example.NineHomework;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Order {
//    private List<OrderItem> items;
//
//    public Order() {
//        items = new ArrayList<OrderItem>();
//    }
//
//    public void addItem(OrderItem item) {
//        items.add(item);
//    }
//
//    public void removeItem(OrderItem item) {
//        items.remove(item);
//    }
//
//    public boolean checkAvailability(Inventory inventory) {
//        for (OrderItem item : items) {
//            if (!inventory.checkAvailability(item.getProduct(), item.getQuantity())) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void processOrder(Inventory inventory) {
//        if (checkAvailability(inventory)) {
//            for (OrderItem item : items) {
//                inventory.decreaseStock(item.getProduct(), item.getQuantity());
//            }
//            System.out.println("Order processed successfully.");
//        } else {
//            System.out.println("Insufficient stock to fulfill the order.");
//        }
//    }
//}
