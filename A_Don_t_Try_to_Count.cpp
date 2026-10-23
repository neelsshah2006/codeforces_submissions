#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0) {
        int n, m;
        cin >> n >> m;
        string a, b;
        cin >> a >> b;

        int cnt = 0;
        while(cnt < 5 && a.find(b) == -1) {
            a += a;
            cnt++;
        }

        if(a.find(b) != -1) {
            cout << cnt << '\n';
        } else cout << -1 << '\n';
    }
    return 0;
}