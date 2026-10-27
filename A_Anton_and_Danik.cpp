#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, cnt = 0;
    cin >> n;
    string s;
    cin >> s;
    for (char c : s)
    {
        if (c == 'A')
            cnt++;
    }

    int h = (n + 1) / 2;
    if ((cnt >= h && n % 2 != 0) || cnt > h)
        cout << "Anton\n";
    else if (cnt == h && n % 2 == 0)
        cout << "Friendship\n";
    else
        cout << "Danik\n";
}