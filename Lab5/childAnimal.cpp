
#include "childAnimal.hpp"
#include <iostream>
#include <string>

Dog::Dog(): Mammal() {
    std::cout << "constructing Dog object " << Dog::getName() << std::endl;
}

Dog::Dog(std::string name, COLOR color, std::string owner): Mammal(name, color), _owner(owner) {
    std::cout << "constructing Dog object " << Dog::getName() << " with color " << Dog::getColor() << std::endl;
}

Dog::~Dog() {
    std::cout << "destructing Dog object " << Dog::getName() << std::endl;
}

void Dog::move() {
    std::cout << "Dog move" << std::endl;
}

void Dog::speak() const {
    std::cout << "Woof Woof" << std::endl;
}

void Dog::eat() {
    std::cout << "Dog eat" << std::endl;
}



Cat::Cat(): Mammal() {
    std::cout << "constructing Cat object " << Cat::getName() << std::endl;
}

Cat::Cat(std::string name, COLOR color, std::string owner): Mammal(name, color), _owner(owner) {
    std::cout << "constructing Cat object " << Cat::getName() << " with color " << Cat::getColor() << std::endl;
}

Cat::~Cat() {
    std::cout << "destructing Cat object " << Cat::getName() << std::endl;
}

void Cat::move() {
    std::cout << "Cat move" << std::endl;
}

void Cat::speak() const {
    std::cout << "Meow Meow" << std::endl;
}

void Cat::eat() {
    std::cout << "Cat eat" << std::endl;
}



Lion::Lion(): Mammal() {
    std::cout << "constructing Lion object " << Lion::getName() << std::endl;
}

Lion::Lion(std::string name, COLOR color, std::string owner): Mammal(name, color), _owner(owner) {
    std::cout << "constructing Lion object " << Lion::getName() << " with color " << Lion::getColor() << std::endl;
}

Lion::~Lion() {
    std::cout << "destructing Lion object " << Lion::getName() << std::endl;
}

void Lion::move() {
    std::cout << "Lion move" << std::endl;
}

void Lion::speak() const {
    std::cout << "Roar Roar" << std::endl;
}

void Lion::eat() {
    std::cout << "Lion eat" << std::endl;
}

