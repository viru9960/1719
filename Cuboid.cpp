#include <iostream>
#include"string"
#include "Shape.h"
#include "Two_D_shape.h"
#include "Three_D_shape.h"
#include "Triangle.h"
#include "Cuboid.h"

using namespace std;

Cuboid::Cuboid(int len,int base,int heigh)
{
    this->len=len;
    this->base=base;
    this->height=height;
}
void Cuboid::volume_of_cuboid()
{
    volume=len*base*height;
    cout<<"volume of cuboid="<<volume<<endl;
}
Cuboid::~Cuboid()
{
    //dtor
}
