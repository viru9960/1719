#include<iostream>
#include "Staff.h"
using namespace std;
Staff::Staff()
{
    cout<<"This  is a default contractor"<<endl;
    name=" ";
    lname="";
}
Staff::Staff(string name,string lname)
{
    cout<<"This is a paramerterized constractor"<<endl;
    this->name=name;
    this->lname=lname;
}
void Staff::display()
{
    cout<<"Name ="<<name<<endl;
    cout<<"Last name="<<lname<<endl;
}

Staff::~Staff()
{
    cout<<"the object is destroyed"<<endl;
}
