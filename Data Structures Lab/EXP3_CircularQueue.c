#include <stdio.h>

void disp(int ar[], int front, int rear, int n) {
	if(rear >= front)
			for(int i = (front + 1)%n; i <= rear; i++)
				printf("%d -> ", ar[i]);
	else {
		if((front + 1) % n != 0)
			for(int i = (front + 1) % n; i < n; i++)
			printf("%d", ar[i]);
		for(int i = 0; i <= rear; i++)
			printf("%d", ar[i]);
	}
	printf("\n");
}

void push(int ar[], int front, int *rear, int n) {
int temp = (*rear + 1) % n;
if(temp == front)
	printf("full");
	else
	{
		int item;
		*rear = temp;
		scanf("%d", &item);
		ar[*rear] = item;
		}}

void pop(int ar[], int *front, int rear, int n) {
if(*front == rear)
		printf("empty");
else {
	*front = (*front + 1) % n;
}}

int main() {
	int n;
	scanf("%d", &n);
	n++;
	int front = 0, rear =0;
	int ar[n];
	for(int i = 0; i < n -1 ; i++)
		push(ar, front, &rear, n);

	while(1)
	{
		int dec;
		scanf("%d", &dec);
		if(dec == 1)
		{
			push(ar, front, &rear, n);
			disp(ar, front, rear, n);
		}
		if(dec == 2) {
		pop(ar, &front, rear, n);
		disp(ar, front, rear, n);
		}

		if(dec == 3) disp(ar, front, rear, n);
	}
printf("\n");}
		

