
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
        int n, k;
        cin >> n >> k;

        bool isInc = true;
        int prev;
        cin >> prev;

        for (int i = 1; i < n; i++)
        {
            int curr;
            cin >> curr;

            if (curr < prev)
            {
                isInc = false;
            }

            prev = curr;
        }

        cout << (k > 1 || isInc ? "YES" : "NO") << '\n';
    }

    return 0;
}
