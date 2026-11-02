#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n;
        cin >> n;
        vector<int> v(n);
        for (int i = 0; i < n; i++)
        {
            cin >> v[i];
        }

        if (v[0] == -1 && v[n - 1] == -1)
        {
            v[0] = v[n - 1] = 0;
        }
        else if (v[0] == -1)
        {
            v[0] = v[n - 1];
        }
        else if (v[n - 1] == -1)
        {
            v[n - 1] = v[0];
        }

        cout << abs(v[n - 1] - v[0]) << '\n';
        for (int i = 0; i < n; i++)
        {
            cout << (v[i] == -1 ? 0 : v[i]) << " ";
        }
        cout << '\n';
    }
    return 0;
}