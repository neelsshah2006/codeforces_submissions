#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int x, y;
    while (t-- > 0) {
        cin >> x >> y;
        if(y >= -1) cout << "YES" << '\n';
        else cout << "NO" << '\n';
    }
    return 0;
}