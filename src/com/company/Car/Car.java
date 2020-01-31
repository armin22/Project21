//package com.company.Car;
//
//public class Car {
//        String model = "unknown";
//        private int speed = 0;
//        int door = 4;
//        int maxSpeed = 200;
//​
//
//        public String getModel() {
//            return model;
//        }
//​
//
//        public int getMaxSpeed() {
//            return maxSpeed;
//        }
//​
//
//        public Car() {
//​
//        }
//
//        public Car(String model) {
//            this.model = model;
//        }
//​
//
//        public void getInfo() {
//            System.out.println("");
//        }
//
//        public void addSpeed(int speed) {
//            this.speed += speed;
//        }
//​
//        ​
//
//        public int getDoor() {
//            return door;
//        }
//​
//
//        public int getSpeed() {
//            return speed;
//        }
//​
//
////        @Override
////        public String toString() {
////            return model + ":" + speed;
////        }
//
//        public class Lada extends Car {
//            public Lada(String model) {
//                super(model);
//            }
//        }
//        public class Subaru extends Car {
//​
//            int door = 15;
//​
//
//            public Subaru() {
//            }
//​
//
//            public Subaru(String model) {
//                super(model);
//                maxSpeed = 260;
//            }
//​
//
//            public int getDoorInfo() {
//                return this.door;
//            }
//        }
//    }