#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int k, n, w;
    cin >> k >> n >> w;
    int req = (w * (w + 1) * k) / 2;
    cout << max(req - n, 0) << '\n';
    return 0;
}