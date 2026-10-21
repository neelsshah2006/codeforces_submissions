#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int a, b, c;
    cin >> a >> b >> c;
    cout << min(a, min(b, c)) << " " << max(a, max(b, c)) << endl;
    return 0;
}