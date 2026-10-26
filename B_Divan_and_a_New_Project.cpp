#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, tmp;
    while (t-- > 0)
    {
        cin >> n;
        vector<pair<int, int>> visits(n);
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            visits[i] = {-tmp, i + 1};
        }

        sort(visits.begin(), visits.end());
        int x = 1;
        int pos[n + 1] = {0};
        long long time = 0;
        for (auto v : visits)
        {
            int k = -v.first;
            int idx = v.second;
            pos[idx] = x;
            time += (2LL * k * abs(x));
            if (x > 0)
                x = -x;
            else
                x = -x + 1;
        }

        cout << time << '\n';
        for (int i = 0; i < n + 1; i++)
        {
            cout << pos[i] << " ";
        }
        cout << '\n';
    }
    return 0;
}