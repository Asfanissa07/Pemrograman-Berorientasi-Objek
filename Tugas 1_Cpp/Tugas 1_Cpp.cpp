#include <iostream>
using namespace std;

int main(){
	//input nilai indeks array 1D
	int jmlArray;
	cout <<"Jumlah Index: "; cin >> jmlArray;
	int angka[jmlArray]; //penggunaan array 1 dimensi
	for(int i = 0; i < jmlArray; i++){
		cout << "Masukkan nilai index ke-"<< i <<" : ";
		cin >> angka[i];
	}
	cout << endl;
	
	//output dengan menggunakan for loop
	cout << "Nilai yang tersimpan:" << endl;
	for(int i = 0; i< jmlArray; i++){
		cout << "Index ke-" << i << ": " << angka[i] << endl;
	}
	cout << endl;
	
	//pernyataan dengan if
	int bilangan;
	cout << "Masukkan angka untuk dicek: "; cin >> bilangan;
	if(bilangan % 2 == 0){
		cout << bilangan << " adalah bilangan genap." << endl;
	}else{
		cout << bilangan << " adalah bilangan ganjil." << endl;
	}
	cout << endl;
	
	//menggunakan while loop
	int n = 1, x;
	cout << "Banyak deret yang akan ditampilkan secara increment: "; cin >> x;
	while(n <= x){
		cout << n << " ";
		n++;
	}
	cout << endl << endl;
	
	//menggunakan do-while loop
	int deret;
	cout << "Banyak deret yang akan ditampilkan secara decrement: "; cin >> deret;
	do {
		cout << deret << " ";
		deret--;
	}while (deret > 0);
	cout << endl << endl;
	
	//menggunakan array multidimensi
	int matriks[3][3] = {{1, 4, 3}, {7, 4, 8}, {3, 1, 2}};
    cout << "Isi matriks:" << endl;
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            cout << matriks[row][col] << " ";
        }
        cout << endl;
    }
	
	return 0;
}
