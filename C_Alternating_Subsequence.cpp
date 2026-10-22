
#include <iostream>
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

        long long sum = 0;
        int curr, best;
        cin >> curr;

        best = curr;
        bool neg = curr < 0;

        for (int i = 1; i < n; i++)
        {
            cin >> curr;

            if ((curr < 0) == neg)
            {
                best = max(best, curr);
            }
            else
            {
                sum += best;
                best = curr;
                neg = curr < 0;
            }
        }

        sum += best;
        cout << sum << '\n';
    }

    return 0;
}
