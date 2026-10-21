
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
        string s;
        cin >> n >> s;

        int empty = 0;
        int actionCount = 0;
        bool foundThree = false;

        for (int i = 0; i < n; i++)
        {
            char c = s[i];

            if (c == '#')
            {
                if (empty == 1)
                {
                    actionCount++;
                }
                else if (empty == 2)
                {
                    actionCount += 2;
                }

                empty = 0;
            }
            else
            {
                empty++;

                if (empty == 3)
                {
                    cout << 2 << '\n';
                    foundThree = true;
                    break;
                }
            }
        }

        if (foundThree)
        {
            continue;
        }

        if (empty == 1)
        {
            actionCount++;
        }
        else if (empty >= 2)
        {
            actionCount += 2;
        }

        cout << actionCount << '\n';
    }

    return 0;
}
