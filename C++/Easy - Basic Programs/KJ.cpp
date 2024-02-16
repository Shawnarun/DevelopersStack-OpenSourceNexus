#include <iostream> 
using namespace std;

void circleArea();
void circlePerimeter();
void volumecone();
void swt();
void swt2();
void calculation();
void display();
void display2();
double pi = 3.14;

int main(){
	display();
}

void display(){
	cout<<"Choose a number "<<endl<<endl
	<<"[1] -> To find the circle area"<<endl
	<<"[2] -> To find the circle Perimeter"<<endl
	<<"[3] -> To find the Volume of Cone"<<endl<<endl
	<<"Enter a Number : ";
		swt();
}

void display2(){
	cout << "Do you want to go back to the Main page :"
	<<"\n\n  [1] -> YES " <<"\n  [2] -> NO";	

	cout<<"\n\n  Choose a number :";
	swt2();
	
}

void swt(){
	int n;
	cin>>n;
	switch(n){
		case 1:
			circleArea();
			break;
		
		case 2:
			circlePerimeter();
			break;
			
		case 3: 
			volumecone();
			break;

		default :
			system("cls");
			cout<<"Ops! You have entered the wrong number.\n\n";
			display();
			
	}
}

void swt2(){
	int n;
	cin>>n;
	switch(n){
		case 1:
			system("cls");
			display();
			break;
		case 2:
			exit(1);
			break;
			
		default :
			system("cls");
			cout<<"invalid number!!!";
			display2();
	}
}

void circleArea(){
	system("cls");
	cout<<"\n Welcome \n You are here to find the area of circle"<<endl<<endl;
	int r;
	
	cout<<"   Enter the Radius : ";
	cin>>r;
	
	double area = pi*r*r;
	
	cout<<endl<<"\n   Your Answer is "<< area<<"\n \n";
	display2();
}

void circlePerimeter(){
	system("cls");
	cout<<"\n Welcome \n You are here to find the Perimeter of circle"<<endl<<endl;
	int r;
	
	cout<<"   Enter the Radius : ";
	cin>>r;
	
	double area = 2*pi*r;
	
	cout<<endl<<"\n   Your Answer is "<< area<<"\n \n";
	display2();
	
}

void volumecone(){
	system("cls");
	cout<<"\n Welcome \n You are here to find the Volume of cone"<<endl<<endl;
	int r,h;
	
	cout<<"   Enter the Radius : ";
	cin>>r;
	cout<<"   Enter the Height : ";
	cin>>h;
	
	double area = pi*r*r*h/3;
	
	cout<<endl<<"\n   Your Answer is "<< area<<"\n \n";
	display2();
	
}

