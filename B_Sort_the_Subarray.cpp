
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        vector<int> original(n);

        for (int i = 0; i < n; i++)
        {
            cin >> original[i];
        }

        int firstMismatch = -1, lastMismatch = -1;

        for (int i = 0; i < n; i++)
        {
            int curr;
            cin >> curr;

            if (curr != original[i])
            {
                original[i] = curr;

                if (firstMismatch == -1)
                {
                    firstMismatch = i;
                }

                lastMismatch = i;
            }
        }

        while (firstMismatch > 0 &&
               original[firstMismatch] >= original[firstMismatch - 1])
        {
            firstMismatch--;
        }
        firstMismatch++;

        while (lastMismatch < n - 1 &&
               original[lastMismatch] <= original[lastMismatch + 1])
        {
            lastMismatch++;
        }
        lastMismatch++;

        cout << firstMismatch << " " << lastMismatch << '\n';
    }

    return 0;
}
