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

        vector<int> a(n);
        for (int &x : a)
            cin >> x;

        if (a[n - 1] == 1)
        {
            cout << "NO\n";
            continue;
        }

        vector<int> ans;
        int ones = 0;
        for (int x : a)
        {
            if (x == 1)
            {
                ones++;
            }
            else
            {
                ans.push_back(ones);

                for (int j = 0; j < ones; j++)
                    ans.push_back(0);

                ones = 0;
            }
        }

        reverse(ans.begin(), ans.end());

        cout << "YES\n";
        for (int p : ans)
            cout << p << " ";
        cout << "\n";
    }

    return 0;
}
