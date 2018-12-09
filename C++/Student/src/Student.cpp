#include "Student.h"
#include<iostream>
#include<string>

using namespace std;


Student::Student()
{
    name=" ";
    lname=" ";
    dep=" ";
    roll=" ";
}
Student::Student(string name)
{
    this->name=name;
}

Student::Student(string name,string lname)
{
    this->name=name;
    this->lname=lname;

}
Student::Student(string name,string lname,string dept)
{
    this->name=name;
    this->lname=lname;
    this->dept=dept;
}

Student::Student(string name,string lname,string dept,int roll)
{
    this->name=name;
    this->lname=lname;
    this->dep=dept;
    this->roll=roll;
}
void Student::display()
{
    cout<<"NAME="<<name<<endl;
    cout<<"LAST NAME="<<lname<<endl;
    cout<<"DEPARTMENT="<<dep<<endl;
    cout<<"ROLL="<<roll<<endl;
}

Student::~Student()
{
    cout<<"Object is destroyed"<<endl;
}
