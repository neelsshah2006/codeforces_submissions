#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int max = n/2 + 1;
    for(int i = 2; i < max; i++) {
        if(n % i == 0) {
            cout << "NO" << '\n';
            return 0;;
        }
    }
    cout << "YES" << '\n';
    return 0;
}