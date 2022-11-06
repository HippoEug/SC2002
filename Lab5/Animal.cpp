
#include "Animal.hpp"
#include <iostream>
#include <string>
#include <vector>

Animal::Animal(): _name("unknown") {
    std::cout << "constructing Animal object " << _name << std::endl;
}

Animal::Animal(std::string name, COLOR color): _name(name), _color(color) {
    //std::cout << "constructing Animal object " << _name << " with color " << reverseCOLOR[_color] << std::endl;
    std::cout << "constructing Animal object " << _name << " with color " << color << std::endl;
}

Animal::~Animal() {
    std::cout << "destructing Animal object " << _name << std::endl;
}

void Animal::speak() const {
    std::cout << "Animal speaks" << std::endl;
}

std::string Animal::getName() {
    return _name;
}

/*
std::string Animal::getColor() {
    return reverseCOLOR[_color];
}
*/
COLOR Animal::getColor() {
    return _color;
}


Mammal::Mammal(): Animal() {
    std::cout << "constructing Mammal object " << Mammal::getName() << std::endl;
}

Mammal::Mammal(std::string name, COLOR color): Animal(name, color) {
    std::cout << "constructing Mammal object " << Mammal::getName() << " with color " << Mammal::getColor() << std::endl;
    //std::cout << "constructing Mammal object" << name << " with color " << color << std::endl;
}

Mammal::~Mammal() {
    std::cout << "destructing Mammal object " << Mammal::getName() << std::endl;
}

void Mammal::move() {
    std::cout << "Mammal move" << std::endl;
}

void Mammal::eat() {
    std::cout << "Mammal eat" << std::endl;
}

