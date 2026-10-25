#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int a, b, c, ab, bc, ac;
    string ans;
    while (t-- > 0)
    {
        cin >> a >> b >> c;
        ab = a + b;
        bc = b + c;
        ac = a + c;

        if (bc % 2 == 0)
            ans += "1 ";
        else
            ans += "0 ";

        if (ac % 2 == 0)
            ans += "1 ";
        else
            ans += "0 ";

        if (ab % 2 == 0)
            ans += "1\n";
        else
            ans += "0\n";
    }

    cout << ans;
    return 0;
}