#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long a, b, c, d;
    cin >> a >> b >> c >> d;

    long long as = a + b - c, am = a + b * c;
    long long sa = a - b + c, sm = a - b * c;
    long long ma = a * b + c, ms = a * b - c;
    if (as == d || am == d || sa == d || sm == d || ma == d || ms == d)
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
    return 0;
}