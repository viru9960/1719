#include <iostream>
#include "Shape.h"
#include "Two_D_shape.h"
#include "Three_D_shape.h"
#include "Triangle.h"
#include "Cuboid.h"


using namespace std;

int main()
{
    Triangle tri1(10,20);
    Triangle tri2(20,30);
    Triangle sum;
    tri1.display_area();
    tri2.display_area();


    sum=tri1+tri2;

    sum.display_area();
    Cuboid obj1(20,13,21);
    obj1.volume_of_cuboid();
    return 0;
}
