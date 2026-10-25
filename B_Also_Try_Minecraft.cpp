
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;
    cin >> n >> m;

    vector<int> height(n);
    for (int i = 0; i < n; i++)
        cin >> height[i];

    vector<long long> left_fall(n, 0), right_fall(n, 0);
    for (int i = 1; i < n; i++)
    {
        left_fall[i] = left_fall[i - 1] + max(0, height[i - 1] - height[i]);
        right_fall[n - i - 1] = right_fall[n - i] + max(0, height[n - i] - height[n - i - 1]);
    }

    while (m--)
    {
        int s, t;
        cin >> s >> t;
        s--;
        t--;

        if (s < t)
            cout << left_fall[t] - left_fall[s] << '\n';
        else
            cout << right_fall[t] - right_fall[s] << '\n';
    }

    return 0;
}
