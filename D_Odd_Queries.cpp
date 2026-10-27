#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, q, l, r, num;
    long long s;
    while (t-- > 0)
    {
        cin >> n >> q;
        vector<long long> sum(n + 1, 0);
        for (int i = 0; i < n; i++)
        {
            cin >> sum[i + 1];
            sum[i + 1] += sum[i];
        }

        for (int i = 0; i < q; i++)
        {
            cin >> l >> r >> num;
            l--;
            r--;
            s = sum[n] + (1LL * (r - l + 1) * num) - (sum[r + 1] - sum[l]);
            if (s % 2 != 0)
            {
                cout << "YES\n";
            }
            else
            {
                cout << "NO\n";
            }
        }
    }
    return 0;
}